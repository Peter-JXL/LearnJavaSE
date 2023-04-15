package chapter20;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemo1Server {
    public static void main(String[] args) throws RemoteException {
        System.out.println("Create World clock remote service...");
        WorldClock worldClock = new WorldClockService();

        // 将此服务转换为远程服务接口:
        WorldClock skeleton = (WorldClock) UnicastRemoteObject.exportObject(worldClock, 0);

        // 将RMI服务注册到1099端口:
        Registry registry = LocateRegistry.createRegistry(1099);

        // 注册此服务，服务名为"WorldClock":
        registry.rebind("WorldClock", skeleton);
    }
}

public class Haupt {
    public static void main(String[] args) {
        Cars c = new vw();

        c.start();
        //c.stop would give an error
        vw v = (vw) c;
        v.stop();


    }
}

class Cars {
    public void start() {
        System.out.println("Car is starting...");
    }
}

class vw extends Cars {
    @Override
    public void start() {
        System.out.println("vw is starting...");
    }

    public void stop() {
        System.out.println("vw is stoping...");
    }
}

class mercedes extends Cars {
    @Override
    public void start() {
        System.out.println("mercedes is starting...");
    }

    public void stop() {
        System.out.println("mercedes is stoping...");
    }

    public void broken() {
        System.out.println("mercedes broken...");
    }
}
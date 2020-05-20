package proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeacherProxy teacherProxy = new TeacherProxy(new TeacherDao());
        teacherProxy.teach();
    }
}

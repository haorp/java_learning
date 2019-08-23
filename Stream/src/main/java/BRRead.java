import java.io.*;

public class BRRead {
    public static void main(String []args)throws IOException
    {
        File f=new File("E:\\a.txt");
        FileOutputStream fo=new FileOutputStream(f);

        OutputStreamWriter writer=new OutputStreamWriter(fo,"utf-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("english");
        writer.close();
        fo.close();

        FileInputStream fi =new FileInputStream(f);
        InputStreamReader read=new InputStreamReader(fi,"utf-8");

        StringBuffer sb=new StringBuffer();
        while (read.ready())
        {
            sb.append((char)read.read());
        }
        System.out.println(sb.toString());
        read.close();
        fi.close();

        File  wj=new File("E:\\hao\\");
        if(!wj.exists())
        {
            wj.mkdirs();
        }
        String name="E:\\hao";
        File wj1=new File(name);
        if(wj1.isDirectory())
        {
            System.out.println("Directory of"+name);

        }else {
            System.out.println("no exit");
        }

        char [] helloArray={'a','b','c'};
        String hestr=new String(helloArray);
        System.out.println(helloArray);
        System.out.println(hestr.length());
    }
}

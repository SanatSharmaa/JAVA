


//WAP TO COPY PDF USING BufferedInputStream
// import java.io.*;
// class FileHandling{
//     public static void main(String args[])throws Exception{
//         FileInputStream fis = new FileInputStream("E:/FileHandling/GUI.pdf");
//         FileOutputStream fos = new FileOutputStream("E:/FileHandling/GUI1.pdf");

//         BufferedInputStream bis = new BufferedInputStream(fis);
//         BufferedOutputStream bos = new BufferedOutputStream(fos);
//         int i;
//         while((i = bis.read())!= -1){
//             bos.write(i);
//         }
//         bos.flush();
//         bis.close();
//         bos.close();
//     }
// }

// //CREATING ANOTHER FILE 
// import java.io.*;
// public class FileHandling{
//     public static void main(String args[]) throws IOException{
//         FileInputStream obj = new FileInputStream ("E:/FileHandling/Java.txt");
//         FileOutputStream obj1 = new FileOutputStream ("E:/FileHandling/Java1.txt");
        
//         int  i;
//         while((i=obj.read())!=-1){
//             obj1.write(i);
//         }
//     }
// }

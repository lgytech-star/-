package asd.one;

public class Student {
	 public float Math;
	   public float English;
	   public float Chinese;
	   public int MathCredit;
	   public int EnglishCredit;
	   public int ChineseCredit;
	   public float product;
	   public String name;
	   public String Id;
	   public String sex;

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Student stu1=new Student();
		{
			   stu1.name="jack";
	            stu1.Id="20190123";
	            stu1.sex="男";
	            stu1.Math=70;
	            stu1.MathCredit=5;
	            stu1.English=73;
	            stu1.EnglishCredit=4;
	            stu1.Chinese=83;
	            stu1.ChineseCredit=3;
	            stu1.product=stu1.Math*stu1.MathCredit+stu1.English*stu1.EnglishCredit+stu1.Chinese*stu1.ChineseCredit;
	            System.out.println("姓名 "+stu1.name);
	            System.out.println("学号 "+stu1.Id);
	            System.out.println("性别 "+stu1.sex);
	            System.out.println("数学成绩 "+stu1.Math);
	            System.out.println("数学学分 "+stu1.MathCredit);
	            System.out.println("英语成绩 "+stu1.English);
	            System.out.println("英语学分 "+stu1.EnglishCredit);
	            System.out.println("物理成绩 "+stu1.Chinese);
	            System.out.println("物理学分 "+stu1.ChineseCredit);
	            System.out.println("学分积 "+stu1.product);

	        }

	  

	        Student stu2=new Student();{

	            stu2.name="timi";
	            stu2.Id="20190231";
	            stu2.sex="男";
	            stu2.Math=73;
	            stu2.MathCredit=5;
	            stu2.English=72;
	            stu2.EnglishCredit=4;
	            stu2.Chinese=78;
	            stu2.ChineseCredit=3;
	            stu2.product=stu2.Math*stu2.MathCredit+stu2.English*stu2.EnglishCredit+stu2.Chinese*stu2.ChineseCredit;
	            System.out.println("姓名 "+stu2.name);
	            System.out.println("学号 "+stu2.Id);
	            System.out.println("性别 "+stu2.sex);
	            System.out.println("数学成绩 "+stu2.Math);
	            System.out.println("数学学分 "+stu2.MathCredit);
	            System.out.println("英语成绩 "+stu2.English);
	            System.out.println("英语学分 "+stu2.EnglishCredit);
	            System.out.println("物理成绩 "+stu2.Chinese);
	            System.out.println("物理学分 "+stu2.ChineseCredit);
	            System.out.println("学分积 "+stu2.product);
	        }
	  

	        Student stu3=new Student();{

	            stu3.name="sally";

	            stu3.Id="20190231";
	            stu3.sex="女";
	            stu3.Math=75;
	            stu3.MathCredit=5;
	            stu3.English=85;
	            stu3.EnglishCredit=4;
	            stu3.Chinese=86;
	            stu3.ChineseCredit=3;
	            stu3.product=stu3.Math*stu3.MathCredit+stu3.English*stu3.EnglishCredit+stu3.Chinese*stu3.ChineseCredit;
	            System.out.println("姓名 "+stu3.name);
	            System.out.println("学号 "+stu3.Id);
	            System.out.println("性别 "+stu3.sex);
	            System.out.println("数学成绩 "+stu3.Math);
	            System.out.println("数学学分 "+stu3.MathCredit);
	            System.out.println("英语成绩 "+stu3.English);
	            System.out.println("英语学分 "+stu3.EnglishCredit);
	            System.out.println("物理成绩 "+stu3.Chinese);
	            System.out.println("物理学分 "+stu3.ChineseCredit);
	            System.out.println("学分积 "+stu3.product);

	        }



	        Student stu4=new Student();{

	            stu4.name="jerry";
	            stu4.Id="20190242";
	            stu4.sex="男";
	            stu4.Math=90;
	            stu4.MathCredit=5;
	            stu4.English=90;
	            stu4.EnglishCredit=4;
	            stu4.Chinese=86;
	            stu4.ChineseCredit=3;
	            stu4.product=stu4.Math*stu4.MathCredit+stu4.English*stu4.EnglishCredit+stu4.Chinese*stu4.ChineseCredit;
	            System.out.println("姓名 "+stu4.name);
	            System.out.println("学号 "+stu4.Id);
	            System.out.println("性别 "+stu4.sex);
	            System.out.println("数学成绩 "+stu4.Math);
	            System.out.println("数学学分 "+stu4.MathCredit);
	            System.out.println("英语成绩 "+stu4.English);
	            System.out.println("英语学分 "+stu4.EnglishCredit);
	            System.out.println("物理成绩 "+stu4.Chinese);
	            System.out.println("物理学分 "+stu4.ChineseCredit);
	            System.out.println("学分积 "+stu4.product);

	         }

	        System.out.print("学分积依次为:"+stu1.product+"  "+stu2.product+"  "+stu3.product+"  "+stu4.product);

	  

	        Student students[]=new Student[4];{

	        students[0]=stu1;
	        students[1]=stu2;
	        students[2]=stu3;
	        students[3]=stu4;

	        }

	        System.out.println("学分积降幂排序为:"+"\n");
	  
	        for(int i=0;i<students.length;i++) {

	            for(int j=i;j<students.length;j++) {

	                if(students[i].product<students[j].product){

	                    float temp=0;

	                    temp=students[i].product;
	                    students[i].product=students[j].product;
	                    students[j].product=temp;
	                } 
	            }
	            System.out.println("学分积降幂排序的结果为："+students[i].product);

	        }

	    } 

	  }
			
		}
	
	}

}

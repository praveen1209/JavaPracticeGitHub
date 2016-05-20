package src.javaLearing;


public class NumberOfWordsInSentence {
	

	
		String Word="";
		int count=0;
		int countmax=0;
		
	
		public void findSentence(String p){
		
		
		String[] ary= p.split(" ");
		
		for(int i=0;i<ary.length;i++){
			String abc=ary[i];
			count=0;
			for(int j=i;j<ary.length;j++){
				String abc2=ary[j];
				
				
				if(abc.equals(abc2)){
					count=count+1;
					if(count>countmax){
						countmax=count;
					//count=count-1;
					Word=abc;
					}
				}
			
			}
			}
		//System.out.println("The Following "+/'Word/'+" is  repeated max times: "+countmax);
		System.out.println("\" "+Word+"\" " +" "+countmax);
			
		}
			
			
		
		
		public static void main(String[] args){
			NumberOfWordsInSentence bab=new NumberOfWordsInSentence();
			String pp="i am a have good guy, i am lot am pens in my bag, am i am also am am am";
			bab.findSentence(pp);
		}

	}




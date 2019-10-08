package jogos;

import javax.swing.JOptionPane;

public class Adivinhacao {
	
	public static void main(String[] args) {
	
	//declarando as minhas tabelas com os números de um a 31	
	  int[] tab1,tab2,tab3,tab4,tab5;
	
	  int resp, escolhido,continuacao;	  
	  escolhido = 0;
	  
	//instânciando as tabelas
	  tab1 = new int[16];
	  tab2 = new int[16];
	  tab3 = new int[16];
	  tab4 = new int[16];
	  tab5 = new int[16];
	  
	 
	  do{
	  JOptionPane.showMessageDialog(null, "Pense em um número inteiro entre 1 a 31");
	  
	  
	  
	  // Gera a 1º tabela;
	  for(int x = 1,n = 0; n<16 & x<=31; x=x+2, n++){
		  tab1[n]=x;
	  }
	  
	  // imprime a 1º tabela e pergunta se o numero pensado se  encontra nela   
		 resp = JOptionPane.showConfirmDialog(null,"O número que vc pensou esta nesta Tabela? \n "+ 
				 							 tab1[0]+" "+tab1[1]+" "+tab1[2]+" "+tab1[3]+"\n"+
		                                     tab1[4]+" "+tab1[5]+" "+tab1[6]+" "+tab1[7]+"\n"+
		                                     tab1[8]+" "+tab1[9]+" "+tab1[10]+" "+tab1[11]+"\n"+
		                                     tab1[12]+" "+tab1[13]+" "+tab1[14]+" "+tab1[15]);
	
		 
		 //caso cliquem no botão cancelar ja encerra o programa
		 if(resp==JOptionPane.CANCEL_OPTION){
			 System.exit(0);
		 } 	
		 
		//se o número pensado estiver na tabela, soma ao numero escolhido com o primeiro número da tabela 
	    if(resp==0){
	    	escolhido = escolhido + tab1[0];
	    	resp = 1;
	    }	    
	
	    // Gera a 2º tabela;
	    for(int n = 0, c1 = 2,c2 =3; n<16; n++){
			
	    	if(n%2==0){
	    		 		tab2[n]=c1;
	    		 		c1=c1+4;
		    }
	    	else{
		    		tab2[n]=c2;
		    		c2=c2+4;
		    }
	    }
	    
	 // imprime a 2º tabela e pergunta se o numero pensado se encontra nela 
	    resp = JOptionPane.showConfirmDialog(null,"O número que você pensou esta Nesta Tabela? \n "+
	    		tab2[0]+" "+tab2[1]+" "+tab2[2]+" "+tab2[3]+"\n"+
                tab2[4]+" "+tab2[5]+" "+tab2[6]+" "+tab2[7]+"\n"+
                tab2[8]+" "+tab2[9]+" "+tab2[10]+" "+tab2[11]+"\n"+
                tab2[12]+" "+tab2[13]+" "+tab2[14]+" "+tab2[15]);
	   
	  //caso cliquem no botão cancelar ja encerra o programa
		 if(resp==JOptionPane.CANCEL_OPTION){
			 System.exit(0);
		 }
	    
	    
	    
	  //se o número pensado estiver na tabela, soma ao numero escolhido com o primeiro número da tabela  
	    if(resp==0){
	    	escolhido = escolhido+ tab2[0];
	    	resp = 1;
	    }
	    
	  // 3º Gera a 3º tabela

		for(int n = 0, l1 = 4,l2 =12,l3=20,l4 =28; n<16; n++){
					
			    	if(n<=3){
			    		 		tab3[n]=l1;
			    		 		l1++;
				    }
			    	else if(n>3 & n<8){
				    		tab3[n]=l2;
				    		l2++;
				    }
			    	else if(n>7 & n<12){
			    		tab3[n]=l3;
			    		   l3++;
			    	}
			    	else if(n>11 & n<16){
			    		tab3[n]=l4;
			    		l4++;
			    	}
		}
		// imprime a 3º tabela e pergunta se o numero pensado se encontra nela 
	    resp = JOptionPane.showConfirmDialog(null,"Esta Nesta Tabela? \n "+ tab3[0]+" "+tab3[1]+" "+tab3[2]+" "+tab3[3]+"\n"+
                tab3[4]+" "+tab3[5]+" "+tab3[6]+" "+tab3[7]+"\n"+
                tab3[8]+" "+tab3[9]+" "+tab3[10]+" "+tab3[11]+"\n"+
                tab3[12]+" "+tab3[13]+" "+tab3[14]+" "+tab3[15]);
	    
	  //caso cliquem no botão cancelar ja encerra o programa
		 if(resp==JOptionPane.CANCEL_OPTION){
			 System.exit(0);
		 }
	    
	    
	    if(resp==0){
	    	escolhido =escolhido+ tab3[0];
	    	resp = 1;
	    }
	    
	 // 4º Gera a 4º tabela

	 		for(int n = 0, c1 = 8,c2 =12,c3=24,c4 =28; n<16; n++){
	 					
	 			    	if(n<=3){
	 			    		 		tab4[n]=c1;
	 			    		 		c1++;
	 				    }
	 			    	else if(n>3 & n<8){
	 				    		tab4[n]=c2;
	 				    		c2++;
	 				    }
	 			    	else if(n>7 & n<12){
	 			    		tab4[n]=c3;
	 			    		   c3++;
	 			    	}
	 			    	else if(n>11 & n<16){
	 			    		tab4[n]=c4;
	 			    		c4++;
	 			    	}
	 		}
	 		// imprime a 4º tabela e pergunta se o numero pensado se encontra nela 
	 	    resp = JOptionPane.showConfirmDialog(null,"Esta Nesta Tabela? \n "+ tab4[0]+" "+tab4[1]+" "+tab4[2]+" "+tab4[3]+"\n"+
	                 tab4[4]+" "+tab4[5]+" "+tab4[6]+" "+tab4[7]+"\n"+
	                 tab4[8]+" "+tab4[9]+" "+tab4[10]+" "+tab4[11]+"\n"+
	                 tab4[12]+" "+tab4[13]+" "+tab4[14]+" "+tab4[15]);
	 	    
	 	    
	 	 //caso cliquem no botão cancelar ja encerra o programa
			 if(resp==JOptionPane.CANCEL_OPTION){
				 System.exit(0);
			 }
			 
	 	    
	 	    if(resp==0){
	 	    	escolhido =escolhido+ tab4[0];
	 	    	resp = 1;
	 	    }
	 	    
	 	//  Gera a 5º tabela

			for(int n = 0, c1 = 16,c2 =20,c3=24,c4 =28; n<16; n++){
						
				    	if(n<=3){
				    		 		tab5[n]=c1;
				    		 		c1++;
					    }
				    	else if(n>3 & n<8){
					    		tab5[n]=c2;
					    		c2++;
					    }
				    	else if(n>7 & n<12){
				    		tab5[n]=c3;
				    		   c3++;
				    	}
				    	else if(n>11 & n<16){
				    		tab5[n]=c4;
				    		c4++;
				    	}
			}
			// imprime a 5º tabela e pergunta se o numero pensado se encontra nela 
		    resp = JOptionPane.showConfirmDialog(null,"Esta Nesta Tabela? \n "+ tab5[0]+" "+tab5[1]+" "+tab5[2]+" "+tab5[3]+"\n"+
	                tab5[4]+" "+tab5[5]+" "+tab5[6]+" "+tab5[7]+"\n"+
	                tab5[8]+" "+tab5[9]+" "+tab5[10]+" "+tab5[11]+"\n"+
	                tab5[12]+" "+tab5[13]+" "+tab5[14]+" "+tab5[15]);
		    
		    
		  //caso cliquem no botão cancelar ja encerra o programa
			 if(resp==JOptionPane.CANCEL_OPTION){
				 System.exit(0);
			 }
		    
		    if(resp==0){
		    	escolhido = escolhido+tab5[0];
		    	resp = 1;
		    }
		    
		    
		    	
		    JOptionPane.showMessageDialog(null, "O número que vc pensou é "+escolhido);
	  
		    continuacao =JOptionPane.showConfirmDialog(null, "Deseja Continuar no jogo? ");
	 
	 //zerar a variável por que vai começar tudo de novo 
	 escolhido=0;
	
	  	}while(continuacao==0);
	}
}
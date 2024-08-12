package lista;

import entidades.*;

public class VetPaciente {
	
	Paciente[] vet;
	int nElem;
	
	public VetPaciente(Paciente[] vet, int nElem) {
		nElem = 0;
		this.vet = new Paciente[10];
	}
	
	public int getNElem(){
		return nElem;
	}
	
	public Paciente getPaciente(int pos){
		if(pos > 0  && pos < nElem) {
			return vet[pos];
		}else {
			return null;
		}
	}
	
	 public int pesquisa(Long cpf) {
		 for(int i = 0; i < nElem; i++) {
			 if (cpf.equals(vet[i].getCPF())) {  //O método equals dessa linha serve para comparações do tipo LONG, tem o mesmo valor de '=='
				 return i;
			 	}
		 } return -1;
	}
	 
	public int insere(Paciente paciente) {
		
		if(vet.length >= nElem) {
			return -1;
		}
		
		for(int i = 0; i < nElem; i++) {
			if(paciente.getCPF().equals(vet[i].getCPF())) {
				return -2;
			}
		}
		vet[nElem] = paciente;
		nElem++;
		return 0;
	}
	
		public Boolean remove(Long cpf, Paciente paciente) {
			for(int i = 0; i < nElem; i++) {
				if(cpf.equals(paciente.getCPF())) {
					
					return true;
				}
				return false;
			}
		}
	
	 
	 
}


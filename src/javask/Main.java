package javask;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rng = new Random();
		if (args.length<3) return;
		int N = Integer.parseInt(args[0]);
		ArrayList<Artifact> items = new ArrayList<>();
		for (int i=0 ; i<N ;i++) {
			Artifact temp;
			
			int Choice=(rng.nextInt() & Integer.MAX_VALUE)%3;
			String mov;
			if (Choice==0) mov="impressionism";
			else if (Choice==1) mov="expressionism";
			else mov="naturalism";
			
			Choice=(rng.nextInt() & Integer.MAX_VALUE)%3;
			String cond;
			if (Choice==0) cond="bad";
			else if (Choice==1) cond="good";
			else cond="excellent";
			
			if ((rng.nextInt() & Integer.MAX_VALUE)%2==0) {
				//create painting
				int length=(rng.nextInt() & Integer.MAX_VALUE)%100+50;//50-150
				int width=(rng.nextInt() & Integer.MAX_VALUE)%100+50;//50-150
				int Choice2=(rng.nextInt() & Integer.MAX_VALUE)%3;
				String tech;
				if (Choice2==0) tech="oil";
				else if (Choice2==1) tech="aquarelle";
				else tech="tempera";
				temp=new Painting("Creator "+i,(rng.nextInt() & Integer.MAX_VALUE)%2022, mov , cond , width , length, tech);
			}
			else {
				//create sculpture
				int volume=(rng.nextInt() & Integer.MAX_VALUE)%1000;
				int Choice2=(rng.nextInt() & Integer.MAX_VALUE)%3;
				String mat;
				if (Choice2==0) mat="iron";
				else if (Choice2==1) mat="stone";
				else mat="wood";
				temp=new Sculpture("Creator "+i,(rng.nextInt() & Integer.MAX_VALUE)%2022,mov,cond,volume,mat);
			}
			items.add(temp);
		}
		
		auction(items,args[1],args[2]);
	}
	
	public static void auction (ArrayList<Artifact> items,String movement,String condition) {
		for (int i=0 ; i<items.size() ; i++) {
			items.get(i).getInfo();
			items.get(i).getIndex();
			items.get(i).evaluate(movement, condition);
		}
	}
}

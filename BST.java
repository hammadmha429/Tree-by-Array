package aaa;

public class BST {
node[] ar = new node[100];

public BST()
{
	for(int i=0 ; i<100 ; i++)
	{
		ar[i] = new node();
		ar[i].d=-1;
	}
}
public void Insertion(int y)
{
	int i=0;
	while(true)
	{
	if(ar[i].d==-1)
	{
		ar[i].d=y;
		break;
	}
	else if(ar[i].d<y)
	{
		i=i*2+2;
	}
	else
	{
		i=i*2+1;
	}
	}
}

public void Inorder(int i)
{
	if(ar[i].d==-1)
	{
		return;
	}
	else
	{
		Inorder(i*2+1);
		System.out.println(ar[i].d);
		Inorder(i*2+2);
	}
}

public void Postorder(int i)
{
	if(ar[i].d==-1)
	{
		return;
	}
	else
	{
		Inorder(i*2+1);
		Inorder(i*2+2);
		System.out.println(ar[i].d);
	}
}

public void Preorder(int i)
{
	if(ar[i].d==-1)
	{
		return;
	}
	else
	{
		System.out.println(ar[i].d);
		Inorder(i*2+1);
		Inorder(i*2+2);
	}
}

public void max()
{
	if(ar[0].d==-1)
	{
		System.out.println("Empty");
	}
	else
	{
		int i=0;
		while(ar[i*2+2].d!=-1)
		{
			i=i*2+2;
		}
		System.out.println(ar[i].d);
	}
}

public void min()
{
	if(ar[0].d==-1)
	{
		System.out.println("Empty");
	}
	else
	{
		int i=0;
		while(ar[i*2+1].d!=-1)
		{
			i=i*2+1;
		}
		System.out.println(ar[i].d);
	}
}

public void search(int y)
{
	if(ar[0].d==-1)
	{
		System.out.println("Empty");
	}
	else {
		int i=0;
		while(i<100)
		{
			if(ar[i].d==y)
			{
				System.out.println("Found : "+ar[i].d);
				return;
			}
		else if(ar[i].d<y)
			{
				i=i*2+2;
			}
		else
		{
			i=i*2+1;
		}
		}
		if(i>=100)
		{
			System.out.println("Not Found!");
		}
	}
}

public int sum(int i)
{
	if(ar[i].d==-1)
	{
		return 0;
	}
	else
	{
		return ar[i].d+sum(i*2+1)+sum(i*2+2);
	}
}

public int Total(int i)
{
	if(ar[i].d==-1)
	{
		return 0;
	}
	else
	{
		return 1+Total(i*2+1)+Total(i*2+2);
	}
}

}//class

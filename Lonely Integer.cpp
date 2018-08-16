#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,x;
    int a[101];
    for(int i=0;i<=100;i++) a[i]=0;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        a[x] += 1;
        
    }
    for(int i=0;i<=100;i++)
    {
        if(a[i]==1)
        {
            printf("%d\n",i);
            break;
        }
    }

    return 0;
}
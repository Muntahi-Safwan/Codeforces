#include <iostream>
using namespace std;

int main()
{
    string line;
    int num;
    cin >> num;
    for (int i = 0; i < num; i++)
    {
        cin >> line;
        if (line.length() > 10)
        {
            cout << line[0] << line.length() - 2 << line[line.length() - 1] << endl;
        }
        else
        {
            cout << line << endl;
        }
    }

    return 0;
}
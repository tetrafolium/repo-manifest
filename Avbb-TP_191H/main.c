#include "touchpanel_senser_ICNT8952AN.h"

int main(void)
{
    int results[8] = {1, 2, 3, 4, 5, 6, 7, 8};
    int output[3] = {0, 0, 0};

    return reproduce_touchpanel_coverity_issue(256, 2, 4, results, output);
}

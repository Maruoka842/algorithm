{
    int[] zalgo(String s) {
	int n = s.length();
	int[] ret = new int[n];
	ret[0] = n;
	int i = 1, j = 0;
	while (i < n) {
	    while (i + j < n && s.charAt(j) == s.charAt(i + j))
		++j;
	    ret[i] = j;
	    if (j == 0) {
		++i;
		continue;
	    }
	    int k = 1;
	    while (i + k < n && k + ret[k] < j) {
		ret[i + k] = ret[k];
		++k;
	    }
	    i += k;
	    j -= k;
	}
	return ret;
    }
}

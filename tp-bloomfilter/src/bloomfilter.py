# -*- coding: utf-8 -*-

""":mod:`bloomfilter` module : Implements a bloomfilter.

:author: `FIL - Univ. Lille <http://portail.fil.univ-lille1.fr>`_

:date: 2016, january

"""

def create (n,f,m):
    """
    Creates a new empty Bloom filter of size :math:`2^n`

    :param n: the log of the size of the filter
    :type n: int
    :param f: the hash function whose should take as input two 
              parameters: the value to be hashed and the number 
              of the subfunction used
    :type f: function(any,int)
    :param m: the number of functions provided by *f*
    :return: the new Bloom filter
    :rtype: dict
    """
    return {"bool_list" : [False for i in range(2**n)], "function" : f, "nb_hash" : m}

def add (bf, e):
    """
    Adds *e* to *bf*.

    :param bf: A Bloom filter
    :type bf: dict
    :param e: The element to be added
    :type e: Any
    """
    for i in range(1, bf["nb_hash"]+1):
        hashcod = bf["function"](e,i)
        bf["bool_list"][hashcod % len(bf["bool_list"])]=True

def contains (bf, e):
    """
    Returns True if *e* is in *bf*.

    :param bf: A Bloom filter
    :type bf: dict
    :param e: The element to be tested
    :type e: Any
    """
    for i in range(1, bf["nb_hash"]+1):
        hashcod = bf["function"](e,i)
        if(bf["bool_list"][hashcod % len(bf["bool_list"])] == False):
            return False
    return True



        
    

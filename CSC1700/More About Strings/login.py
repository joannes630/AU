# The get_login_name function accepts a first name,
# last name, and ID number as arguments. It returns
# a system login name.

def get_login_name(first, last, idnumber):
    set1 = first[0 : 3]
    set2 = last[0 : 3]
    set3 = idnumber[-3 :]
    login_name = set1 + set2 + set3
    return login_name

# Week 5 Lab Report
## Researching Commands

#

	## find - search for files in a directory hierarchy
#

### Options
| Option 1 | Description|
| ----------- | ----------- |
| -name |   Search a file with specific name or name pattern |

Example:
| S.No|Usage| Result|Remarks
   | ----------- | ----------- | ----------- | ----------- |
   |1| find ./technical/* -name bill.txt |./technical/government/Env_Prot_Agen/bill.txt| Find a fille with specific name|
   |2| find ./technical/* -name chap*.txt |./technical/911report/chapter-1.txt ./technical/911report/chapter-10.txt ./technical/911report/chapter-11.txt ./technical/911report/chapter-12.txt ./technical/911report/chapter-13.1.txt ./technical/911report/chapter-13.2.txt ./technical/911report/chapter-13.3.txt ./technical/911report/chapter-13.4.txt ./technical/911report/chapter-13.5.txt ./technical/911report/chapter-2.txt ./technical/911report/chapter-3.txt ./technical/911report/chapter-5.txt ./technical/911report/chapter-6.txt ./technical/911report/chapter-7.txt ./technical/911report/chapter-8.txt ./technical/911report/chapter-9.txt| Find a file which start with chap and is a txt format
   |3| find ./technical/ ! -name '*.txt' |./technical/ ./technical/plos ./technical/biomed ./technical/government ./technical/government/Env_Prot_Agen ./technical/government/Gen_Account_Office ./technical/government/About_LSC ./technical/government/Media ./technical/government/Alcohol_Problems ./technical/government/Post_Rate_Comm ./technical/911report ./technical/abc| Find files or directory which doesnot have name ending with ".txt"


#
| Option 2 | Description|
| ----------- | ----------- |
| -size |   Search a file with specifiz size, or lessthan or greater than size. |

Example:
| S.No|Usage| Result| Remarks
   | ----------- | ----------- | ----------- |----------- |
   |1| find ./technical -size 93k |./technical/government/Alcohol_Problems/Session3-PDF.txt|Finding file with Specific Size of 93K|
   |2| find ./technical -size +200k |./technical/government/Env_Prot_Agen/bill.txt ./technical/government/Gen_Account_Office/GovernmentAuditingStandards_yb2002ed.txt ./technical/government/Gen_Account_Office/Statements_Feb28-1997_volume.txt ./technical/government/Gen_Account_Office/d01591sp.txt ./technical/government/About_LSC/commission_report.txt ./technical/911report/chapter-13.4.txt  ./technical/911report/chapter-13.5.txt ./technical/911report/chapter-3.txt| Findling all files with size greater than 200K|
   |3|  find ./technical -size -2k |./technical/plos/pmed.0020191.txt ./technical/plos/pmed.0020226.txt ./technical/government/Alcohol_Problems|Finding file with size less than 2k|


#
| Option 3 | Description|
| ----------- | ----------- |
| -perm |   Search a file with specifiz file permission. |

Example:
| S.No|Usage| Result| Remarks
   | ----------- | ----------- | ----------- |----------- |
   |1| find ./technical -perm 755 | Large list of files. | Findling all files with permission as 755|
   |2| find ./technical -perm u=rwx,g=rx,o=rx |Same large list of files as with 755 | Findling all files with permission user as rwx, group rx and others as rx.  [ r-read,w- write, x- executable]|
   |3| find ./technical ! -perm 755 | No result, as there is no such file | Findling all files which do not have permission as 755|

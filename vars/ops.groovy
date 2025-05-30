def sum(a,b)
{
  echo "sum of ${a} and ${b} is ${a+b}"
}

def cdown(repo)
{
  git 'https://github.com/sai-kadinti/${repo}.git'
}

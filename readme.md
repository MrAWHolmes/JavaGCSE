creating a new repo....
…or create a new repository on the command line
echo "# JavaGCSE" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:MrAWHolmes/JavaGCSE.git
git push -u origin main


…or push an existing repository from the command line
git remote add origin git@github.com:MrAWHolmes/JavaGCSE.git
git branch -M main
git push -u origin main


clone...
The short answer
To clone a Git repository using the SSH protocol, you can use the git clone command with a valid SSH URL as follows:

$ git clone git@host:username/repository.git

ie. git clone git@github.com:MrAWHolmes/JavaGCSE.git


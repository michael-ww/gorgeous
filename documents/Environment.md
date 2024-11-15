## Git

ssh-keygen -r rsa -C michael.ren@farfetch.com -f ~/.ssh/id_rsa_gitlab  
ssh-keygen -r rsa -C michael_ww@163.com -f ~/.ssh/id_rsa_github  

vim ~/.ssh/config  

```yaml
Host gitlab.fftech.info
        HostName gitlab.fftech.info
        Port 22
        User michael.ren@farfetch.com
        IdentityFile /c/Users/michael.ren/.ssh/id_rsa_gitlab

Host github.com
        HostName github.com
        Port 22
        User michael_ww@163.com
        IdentityFile /c/Users/michael.ren/.ssh/id_rsa_github
```

git config --list  
git config --global user.name michael.ren  
git config --global user.email michael.ren@farfetch.com

git clone --recursive git://github.com/mysociety/whatdotheyknow.git

git config --local user.name michael  
git config --local user.email michael_ww@163.com

### rename branch

git branch -m master main  
git fetch origin  
git branch -u origin/main main  
git remote set-head origin -a

## WSL

sudo rm /etc/resolv.conf  
sudo bash -c 'echo "nameserver 8.8.8.8" > /etc/resolv.conf'  
sudo bash -c 'echo "[network]" > /etc/wsl.conf'  
sudo bash -c 'echo "generateResolvConf = false" >> /etc/wsl.conf'  
sudo chattr +i /etc/resolv.conf  

sudo rm -rf /etc/apt/apt.conf.d/20snapd.conf  
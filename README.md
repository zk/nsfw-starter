# nsfw-starter

A template for NSFW webapps.


## Getting Started

Welcome to the NSFW Starter Kit. To get started you'll have to install:

* Leiningen -- https://github.com/technomancy/leiningen
* Sass -- http://sass-lang.com/
* Foreman -- https://github.com/ddollar/foreman
* Heroku Toolbelt, required for deploy to Heroku (duh).
  -- https://toolbelt.heroku.com/

Next, clone this repo

```bash
git clone https://github.com/zk/nsfw-starter <project name>
cd <project name>
bin/dev
```

Then open up at browser at http://localhost:5000


Don't forget to modify this README with your app specific info.

To deploy to Heroku:

```
heroku create
git push heroku master
```

Your 1st deploy to Heroku takes a while, subsequent deploys will be much quicker.


## Dev

Run `bin/dev` to start (allthethings)


## Working on This Repo

* Use feature branches
* Open PRs from feature branches
* Run tests before merging feature branch into master
* `git merge --squash <feature branch>`

https://sandofsky.com/blog/git-workflow.html

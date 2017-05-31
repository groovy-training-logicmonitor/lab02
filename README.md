# Lab02: Functions

The goal of this laboratory exercise is to learn more about the workflow involving IntelliJ for code editing, run environments and Git/GitHub for version control. Additionally, this lab also includes the concept of functions.

## Step 1. Cloning this laboratory

First, we need to get this project onto your computer. We do this using the `git clone` command. In the Terminal app type the following command

```bash
git clone https://github.com/groovy-training-logicmonitor/lab02
```

This command creates a copy of all the files in this project onto your computer. Once this operation is complete, we can then move onto opening the project in IntelliJ. First, go to IntelliJ and go to the Welcome screen by either launching the app or closing all project windows. Next, select *Checkout from Version Control*. In the dropdown, select *GitHub* and select *Password* in the *Auth Type* drop down menu. Enter your login and password credentials using the GitHub user account you gave me at the beginning of this training. Once you have logged in, copy the above URL into the *Git Repository URL* field. Then click *Clone*. You should now have the project cloned to your computer and opened in IntelliJ. You can skip to **Step 3** if you used this alternative method.

**Alternative** If you wish, you can also clone this project using IntelliJ. 

## Step 2. Opening the project in IntelliJ

Opening the project is simple. Select *Open* from the Welcome screen. Next, navigate to the location of the project on your computer and select the directory *lab02*. This should open the project in IntelliJ and you should be ready to run it.

## Step 3. Writing functions

In this step we'll write some specific functions and then test that they work as expected. Complete each of the following functions before moving on to *Committing the code*.

### Void functions must have a side affect

For a function that takes no arguments and returns no values, a void function, it must have a side affect for it to be useful. Write a quick function that prints something to the screen. The output to the conosle is the side affect of this function.

When you're done, call this function in the script so that the output is seen when your run `main.groovy`.

### Non-void functions should return something interesting

Now we're going to do something that might not have a side affect at all, since this next function will take arguments and return a value.

Write a function that takes a single character and a number. Make sure the number is positive. Next make the function return a string that contains the character passed in repeated the number of times indicated in the passed in integer. For example `repeat(4, 'c')` would return the string `'cccc'`.

### Overloading

Remember that overloading is using the same name for a function with with different number and/or types of arguments. Also remember that the return type does not disambiguate function names, only the parameters.

Write another version of the the function from above that only takes a number. Then choose a default character value, for example `'x'`, and have it return a similar string to `repeat` above.

### Default values

Now factor the two versions of `repeat` so that there is only one. This time, however, use a default value to allow the same functionality as above. In other words, you should still be able to make the calls `repeat(4, 'c')` and `repeat(4)`, but with only one implementation instead of two. 

### Make yourself useful

Write a function that does something you do all the time that requires more than one line of code. 

When we're all done we can discuss what everybody wrote and see how we can share some of the more useful functions between each other.

## Step 4. Committing the code

Now it's time to commit our code. But first we need to create our own branches. We do this because we want to push our code up to GitHub, but without affecting the *master* branch. That's the branch we'll create our pull request again. To create your own branch in IntelliJ, right click on the project *lab02* -> *Git* -> *Repository* -> *Branches...*. Then click on *New Branch*. Under *New branch name* create a branch name. The name needs to be unique for each of you. The best way is to use your user name. For example `profknight-submission`. Press *OK* and that's it. The branch is created.

The next step is to commit our changes made to `main.groovy`. Before you commit, be sure to remove the token in `API_KEY` the URL in the `.baseUrl` call. This protects our project against other GitHub users since these projects are public. Next, right click on `main.groovy` in the project list and select *Git* -> *Commit File...*. Then under *Commit message* enter some text. It doesn't matter what you enter as long as it's not white space alone. Then press commit and we're ready to push the branch up to GitHub.

## Step 5. Pushing your changes

We can now push the commit from the last step up to GitHub. Right click on the project and select *Git* -> *Repository* -> *Push...*. On the subsequent dialog select *Push*. Once the push is done, if successful, you should see a message indicating the status of the push. The final step is creating the pull request.

## Step 6. Creating the pull request

Go to the lab repository on GitHub at https://github.com/groovy-training-logicmonitor/lab02. Your branch should be visible just above the the file listing. If you don't, ask me, and I'll point you where to go. If you do see your branch, click on the *Compare & Pull request*. You'll be taken to the next screen and you just need to click the *Create pull request* button and your done. 

## Step 7. Profiting

Yes, I realize I made the same joke last time, but I'm lazy and I copy and pasted some of this stuff from last time. Besides, that's it you're done. We'll go through all the pull requests, leave some comments and then pick our favorite to merge into the `master` branch.


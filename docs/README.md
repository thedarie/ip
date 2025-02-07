# Bim User Guide
## Quick Start
Bim is an application that helps you keep track of your tasks 
ensuring that you will not forget them.

### Managing your tasks

Tasks are categorized into 3 different categories.

|   Task   | Requires description | Requires date |
|:--------:|:--------------------:|:-------------:|
|   Todo   |         Yes          |      No       |
| Deadline |         Yes          |      Yes      |
|  Event   |         Yes          |      Yes      |


You can add tasks with your own description and date (if applicable) to Bim.

Tasks can also be deleted regardless of their status.

### Modifying status of tasks

If you have completed your task, you can mark the task as completed. You can also set completed task as
incomplete.


### Search for tasks

You can search for any task that contains a keyword or a phrase that you want.

### Saving the tasks
All tasks are saved into a text file at `[JAR file location]/data/BimData.txt`.
After any command that modifies the data, the file will be updated automatically.


## Features
1. Managing your tasks
   - Adding tasks
     - Adding a todo: [`todo`](#todo---add-a-todo)
     - Adding a deadline: [`deadline`](#deadline---add-a-deadline)
     - Adding an event: [`event`](#event---add-an-event)
   - Listing all tasks: [`list`](#list---list-all-tasks)
   - Deleting tasks: [`delete`](#delete---delete-a-task)
   - Modifying status of tasks
     - Mark a task as complete: [`mark`](#mark---set-the-task-to-be-completed)
     - Mark a task as incomplete: [`unmark`](#unmark---set-the-task-to-be-uncompleted)
3. Search for tasks: [`find`](#find---find-a-task-with-a-keyword)
4. Exiting the program: [`bye`](#bye---exit-the-program)
5. Saving tasks

## Command Format
- Words in `UPPERCASE` are parameters to be specified by the user.
- `INDEX` refers to the number shown in the `list` command.

## Usage

### `todo` - Add a todo

Adds a **Todo** to Bim.

Format: `todo DESCRIPTION`

Example: `todo buy groceries`


```
I have added a new task!
    [T][ ] buy groceries
```

<br />

### `deadline` - Add a deadline

Adds a **deadline** to Bim.

Format: `deadline DESCRIPTION /by DATE`

Date must be in the format `yyyy-mm-dd`

Example: `deadline submit project /by 2022-10-10`

```
I have added a new task!
    [D][ ] submit project (by: Oct-10-2022)
```

<br />

### `event` - Add an event

Adds an event to Bim.

Format: `event DESCRIPTION /at DATE`

Example: `event project meeting /at 2022-10-10`
```
I have added a new task!
    [E][ ] project meeting (at: Oct-10-2022)
```

<br />

### `list` - List all tasks

Lists all tasks that Bim has in store.

<br />


### `mark` - Set the task to be completed

Sets the task with the given index to be completed.

Format: `mark INDEX`

Example: `mark 1`
```
Task has been marked. Well done!
    [T][X] buy groceries
```

<br />

### `unmark` - Set the task to be uncompleted

Sets the task with the given index to be incomplete.

Format: `unmark INDEX`

<br />

### `delete` - Delete a task

The task with the given index will be deleted

Format: `delete INDEX`

<br />

### `find` - Find a task with a keyword

Lists all task that contains the keyword.

Format: `find KEYWORD`

- `KEYWORD` can be a word or a phrase
- `KEYWORD` is case-insensitive

Example: `find meeting`
```
These are the tasks containing your keyword!
	1.[E][ ] project meeting (at: Oct-10-2022)
```

<br />

### `bye` - Exit the program

Terminate the program

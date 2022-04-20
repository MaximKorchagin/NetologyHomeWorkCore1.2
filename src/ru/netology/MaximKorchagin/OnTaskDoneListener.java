package ru.netology.MaximKorchagin;
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone (String result);
}
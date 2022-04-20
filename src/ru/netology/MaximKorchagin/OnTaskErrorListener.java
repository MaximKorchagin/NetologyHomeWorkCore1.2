package ru.netology.MaximKorchagin;
@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
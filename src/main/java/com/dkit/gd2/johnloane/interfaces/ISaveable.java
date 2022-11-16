package com.dkit.gd2.johnloane.interfaces;

import java.util.List;

public interface ISaveable
{
    List<String> write();
    void read(List<String> savedValues);
}

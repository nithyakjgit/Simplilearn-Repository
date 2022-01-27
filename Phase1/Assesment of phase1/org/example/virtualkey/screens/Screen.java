package org.example.virtualkey.screens;

import java.io.IOException;

public interface Screen {

	public void Show();

    public void NavigateOption(int option) throws IOException, Exception;
    
    public void GetUserInput() throws Exception;
}

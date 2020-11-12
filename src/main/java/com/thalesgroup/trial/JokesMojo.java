package com.thalesgroup.trial;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import javax.inject.Inject;

@Mojo(name = "joke", defaultPhase = LifecyclePhase.INITIALIZE)
public class JokesMojo extends AbstractMojo {

    @Inject
    JokesRepository jokesRepository;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(jokesRepository.getRandomJoke());
    }
}

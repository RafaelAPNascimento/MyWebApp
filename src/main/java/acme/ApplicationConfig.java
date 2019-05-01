package acme;

import java.util.Set;

import javax.ws.rs.core.Application;

import acme.resources.LivroResource;

@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application{
 
 @Override
 public Set getClasses() {
  Set<Class> resources = new java.util.HashSet<>();
  resources.add(LivroResource.class);
  return resources;
 }
}
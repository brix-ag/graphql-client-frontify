package ch.brix.gql.client.frontify.builders;

public class LogoLibrary_collaborators extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryCollaborators> {
  public LogoLibrary_collaborators() {
    super(new ch.brix.gql.client.Call<>("collaborators", "LibraryCollaborators"));
  }
  public LogoLibrary_collaborators onLibraryCollaborators(On_LibraryCollaborators typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

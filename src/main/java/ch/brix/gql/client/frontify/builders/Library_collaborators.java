package ch.brix.gql.client.frontify.builders;

public class Library_collaborators extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryCollaborators> {
  public Library_collaborators() {
    super(new ch.brix.gql.client.Call<>("collaborators", "LibraryCollaborators"));
  }
  public Library_collaborators onLibraryCollaborators(On_LibraryCollaborators typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

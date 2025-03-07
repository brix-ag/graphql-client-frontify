package ch.brix.gql.client.frontify.builders;

public class IconLibrary_collaborators extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryCollaborators> {
  public IconLibrary_collaborators() {
    super(new ch.brix.gql.client.Call<>("collaborators", "LibraryCollaborators"));
  }
  public IconLibrary_collaborators onLibraryCollaborators(On_LibraryCollaborators typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

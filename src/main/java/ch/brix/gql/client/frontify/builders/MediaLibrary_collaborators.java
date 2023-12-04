package ch.brix.gql.client.frontify.builders;

public class MediaLibrary_collaborators extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryCollaborators> {
  public MediaLibrary_collaborators() {
    super(new ch.brix.gql.client.Call<>("collaborators", "LibraryCollaborators"));
  }
  public MediaLibrary_collaborators onLibraryCollaborators(On_LibraryCollaborators typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

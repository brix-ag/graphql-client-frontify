package ch.brix.gql.client.frontify.builders;

public class LibraryCollaboratorUserItems_edges extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.LibraryCollaboratorUserEdge>> {
  public LibraryCollaboratorUserItems_edges() {
    super(new ch.brix.gql.client.Call<>("edges", "LibraryCollaboratorUserEdge"));
  }
  public LibraryCollaboratorUserItems_edges onLibraryCollaboratorUserEdge(On_LibraryCollaboratorUserEdge typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

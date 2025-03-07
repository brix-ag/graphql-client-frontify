package ch.brix.gql.client.frontify.builders;

public class LibraryCollaborators_users extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryCollaboratorUserItems> {
  public LibraryCollaborators_users() {
    super(new ch.brix.gql.client.Call<>("users", "LibraryCollaboratorUserItems"));
  }
  public LibraryCollaborators_users args(LibraryCollaborators_users_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LibraryCollaborators_users onLibraryCollaboratorUserItems(On_LibraryCollaboratorUserItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

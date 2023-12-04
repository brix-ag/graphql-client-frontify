package ch.brix.gql.client.frontify.builders;

public class Library_currentUserPermissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryUserPermissions> {
  public Library_currentUserPermissions() {
    super(new ch.brix.gql.client.Call<>("currentUserPermissions", "LibraryUserPermissions"));
  }
  public Library_currentUserPermissions onLibraryUserPermissions(On_LibraryUserPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

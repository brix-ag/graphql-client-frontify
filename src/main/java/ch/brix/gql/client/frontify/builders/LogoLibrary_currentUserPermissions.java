package ch.brix.gql.client.frontify.builders;

public class LogoLibrary_currentUserPermissions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.LibraryUserPermissions> {
  public LogoLibrary_currentUserPermissions() {
    super(new ch.brix.gql.client.Call<>("currentUserPermissions", "LibraryUserPermissions"));
  }
  public LogoLibrary_currentUserPermissions onLibraryUserPermissions(On_LibraryUserPermissions typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

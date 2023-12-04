package ch.brix.gql.client.frontify.builders;

public class LibraryRootFolder_subFolders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SubFolderItems> {
  public LibraryRootFolder_subFolders() {
    super(new ch.brix.gql.client.Call<>("subFolders", "SubFolderItems"));
  }
  public LibraryRootFolder_subFolders args(LibraryRootFolder_subFolders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LibraryRootFolder_subFolders onSubFolderItems(On_SubFolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

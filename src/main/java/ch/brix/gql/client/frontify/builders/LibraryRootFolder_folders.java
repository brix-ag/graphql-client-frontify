package ch.brix.gql.client.frontify.builders;

public class LibraryRootFolder_folders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.FolderItems> {
  public LibraryRootFolder_folders() {
    super(new ch.brix.gql.client.Call<>("folders", "FolderItems"));
  }
  public LibraryRootFolder_folders args(LibraryRootFolder_folders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public LibraryRootFolder_folders onFolderItems(On_FolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

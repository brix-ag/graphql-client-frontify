package ch.brix.gql.client.frontify.builders;

public class Folder_folders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.FolderItems> {
  public Folder_folders() {
    super(new ch.brix.gql.client.Call<>("folders", "FolderItems"));
  }
  public Folder_folders args(Folder_folders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Folder_folders onFolderItems(On_FolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

package ch.brix.gql.client.frontify.builders;

public class SubFolder_folders extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.FolderItems> {
  public SubFolder_folders() {
    super(new ch.brix.gql.client.Call<>("folders", "FolderItems"));
  }
  public SubFolder_folders args(SubFolder_folders_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public SubFolder_folders onFolderItems(On_FolderItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

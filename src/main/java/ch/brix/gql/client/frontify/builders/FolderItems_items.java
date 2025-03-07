package ch.brix.gql.client.frontify.builders;

public class FolderItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Folder>> {
  public FolderItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Folder"));
  }
  public FolderItems_items onSubFolder(On_SubFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public FolderItems_items onFolder(On_Folder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

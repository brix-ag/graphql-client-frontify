package ch.brix.gql.client.frontify.builders;

public class SubFolderItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.SubFolder>> {
  public SubFolderItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "SubFolder"));
  }
  public SubFolderItems_items onSubFolder(On_SubFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

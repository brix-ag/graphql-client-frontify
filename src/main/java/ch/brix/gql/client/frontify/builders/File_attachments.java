package ch.brix.gql.client.frontify.builders;

public class File_attachments extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.AssetAttachment>> {
  public File_attachments() {
    super(new ch.brix.gql.client.Call<>("attachments", "AssetAttachment"));
  }
  public File_attachments onAssetAttachment(On_AssetAttachment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

package ch.brix.gql.client.frontify.builders;

public class DeleteAttachment_attachment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.Attachment> {
  public DeleteAttachment_attachment() {
    super(new ch.brix.gql.client.Call<>("attachment", "Attachment"));
  }
  public DeleteAttachment_attachment onAssetAttachment(On_AssetAttachment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public DeleteAttachment_attachment onAttachment(On_Attachment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

package ch.brix.gql.client.frontify.builders;

public class On_CreateAttachment extends ch.brix.gql.client.TypeBuilder {
  public On_CreateAttachment() {
    super(new ch.brix.gql.client.On("CreateAttachment"));
  }
  /**
   * The newly created `Attachment` processing job response.
   */
  public On_CreateAttachment job(CreateAttachment_job callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}

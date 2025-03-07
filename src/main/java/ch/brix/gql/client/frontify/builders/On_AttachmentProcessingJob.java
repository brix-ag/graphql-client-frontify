package ch.brix.gql.client.frontify.builders;

public class On_AttachmentProcessingJob extends ch.brix.gql.client.TypeBuilder {
  public On_AttachmentProcessingJob() {
    super(new ch.brix.gql.client.On("AttachmentProcessingJob"));
  }
  /**
   * `Attachment` Id.
   */
  public On_AttachmentProcessingJob attachmentId() {
    _add_field("attachmentId");
    return this;
  }
}

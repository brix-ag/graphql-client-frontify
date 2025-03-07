package ch.brix.gql.client.frontify.builders;

public class CreateAttachment_job extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AttachmentProcessingJob> {
  public CreateAttachment_job() {
    super(new ch.brix.gql.client.Call<>("job", "AttachmentProcessingJob"));
  }
  public CreateAttachment_job onAttachmentProcessingJob(On_AttachmentProcessingJob typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}

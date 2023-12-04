package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AttachmentProcessingJob {
  /**
   * `Attachment` Id.
   */
  @com.google.gson.annotations.SerializedName("attachmentId")
  private ch.brix.gql.client.frontify.scalars.IdScalar attachmentId;
}

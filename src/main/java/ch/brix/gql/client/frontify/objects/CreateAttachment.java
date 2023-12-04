package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateAttachment {
  /**
   * The newly created `Attachment` processing job response.
   */
  @com.google.gson.annotations.SerializedName("job")
  private ch.brix.gql.client.frontify.objects.AttachmentProcessingJob job;
}

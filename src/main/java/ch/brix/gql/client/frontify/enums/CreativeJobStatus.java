package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `Creative Job` statuses.
 */
public enum CreativeJobStatus {
  /**
   * The job is currently being prepared and is awaiting rendering.
   */
  @com.google.gson.annotations.SerializedName("PROCESSING") 
  PROCESSING,
  /**
   * The job is currently rendering.
   */
  @com.google.gson.annotations.SerializedName("RENDERING") 
  RENDERING,
  /**
   * The job has been canceled successfully.
   */
  @com.google.gson.annotations.SerializedName("CANCELED") 
  CANCELED,
  /**
   * The job has been completed successfully.
   */
  @com.google.gson.annotations.SerializedName("FINISHED") 
  FINISHED,
  /**
   * The processing of the job failed.
   */
  @com.google.gson.annotations.SerializedName("FAILED") 
  FAILED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}

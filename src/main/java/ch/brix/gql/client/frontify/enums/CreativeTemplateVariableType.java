package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `CreativeTemplateVariable` types.
 */
public enum CreativeTemplateVariableType {
  /**
   * Boolean Variable Type, possible values are `true` or `false`
   */
  @com.google.gson.annotations.SerializedName("BOOL") 
  BOOL,
  /**
   * Number Variable Type, values must be integers
   */
  @com.google.gson.annotations.SerializedName("NUMBER") 
  NUMBER,
  /**
   * Text content Variable Type
   */
  @com.google.gson.annotations.SerializedName("TEXT") 
  TEXT,
  /**
   * Image Variable Type, values are `AssetID`s for referencing
   */
  @com.google.gson.annotations.SerializedName("IMAGE") 
  IMAGE,
  /**
   * Color Variable Type, you can either pass an rgba object or a HEX value as string
   */
  @com.google.gson.annotations.SerializedName("COLOR") 
  COLOR,
  /**
   * Float Variable Type
   */
  @com.google.gson.annotations.SerializedName("FLOAT") 
  FLOAT,
  /**
   * Position Variable Type, you need to pass an object with `left: number` and `top: number` properties
   */
  @com.google.gson.annotations.SerializedName("POSITION") 
  POSITION;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}

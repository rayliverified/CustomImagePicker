package stream.customimagepicker;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;

public class CustomImagePicker {

	public static final String ASCENDING = " ASC";
	public static final String DESCENDING = " DESC";
	public static final String DATE_TAKEN = "datetaken";

    /**
     * @param context - default method to get adapter.
     * @return
     */
	public ImageAdapter getAdapter(Context context) {
		return getAdapter(context, DATE_TAKEN, DESCENDING);
	}

    /**
     * @param context
     * @param columns - set image sort based on columns.
     * @param sort - set ASCENDING, DESCENDING sort order based on columns.
     * @return
     */
	public ImageAdapter getAdapter(Context context, String columns, String sort) {
		Cursor mImageCursor = null;
		try {
			String[] projection = new String[]{MediaStore.Images.ImageColumns._ID, MediaStore.Images.ImageColumns.DATA,
					MediaStore.Images.ImageColumns.BUCKET_DISPLAY_NAME, MediaStore.Images.ImageColumns.DATE_TAKEN, MediaStore.Images.ImageColumns.MIME_TYPE};
			mImageCursor = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, null, null, columns + sort);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ImageAdapter mAdapter = new ImageAdapter(context, mImageCursor);
		return mAdapter;
	}

	/**
	 * @param drawable - set drawable resource Id to replace default placeholder image.
	 */
	public void setDrawable(int drawable) {
		ImageAdapter.DRAWABLE = drawable;
	}

    /**
     * @param height - set image height (dp).
     */
	public void setHeight(int height) {
		ImageAdapter.IMAGE_HEIGHT = height;
	}

    /**
     * @param width - set image width (dp).
     */
	public void setWidth(int width) {
		ImageAdapter.IMAGE_WIDTH = width;
	}

    /**
     * @param padding - set image padding (dp).
     */
	public void setPadding(int padding) {
		ImageAdapter.IMAGE_PADDING = padding;
	}

    /**
     * @param kind - set 1, 2, 3, 4 for image thumbnail quality.
     *             1 is the best quality and 4 is the lowest quality. Default 1.
     */
	public void setKind(int kind) {
		ImageAdapter.KIND = kind;
	}
}
